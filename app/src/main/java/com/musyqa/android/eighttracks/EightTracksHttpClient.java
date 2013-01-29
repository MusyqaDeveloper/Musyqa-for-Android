
package com.musyqa.android.eighttracks;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.kevinsawicki.http.HttpRequest;
import com.github.kevinsawicki.http.HttpRequest.HttpRequestException;
import com.musyqa.android.Config;

import java.io.IOException;
import java.io.Reader;
import java.util.Locale;

/**
 * The Class EightTracksHttpClient.
 */
public class EightTracksHttpClient {

    private static final String BASE_URL = "http://8tracks.com/";

    private ObjectMapper mObjectMapper = new ObjectMapper();

    /**
     * Gets the mix set.
     * 
     * @return the mix set
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MixSet getMixSet() throws IOException {
        try {
            return fromJson(ok(get("mixes.json")), MixSet.class);
        } catch (HttpRequestException e) {
            throw e.getCause();
        }
    }

    /**
     * Gets the mix set.
     * 
     * @param perPage the per page
     * @param page the page
     * @return the mix set
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MixSet getMixSet(int perPage, int page) throws IOException {
        try {
            String url = String.format(
                    Locale.getDefault(),
                    "mixes.json?per_page=%d&page=%d", perPage, page);
            
            return fromJson(ok(get(url)), MixSet.class);
        } catch (HttpRequestException e) {
            throw e.getCause();
        }
    }

    /**
     * Create object of class type from content of request
     * 
     * @param request
     * @param target
     * @return object of target class type
     * @throws IOException
     */
    protected <V> V fromJson(final HttpRequest request, final Class<V> clazz)
            throws IOException {

        final Reader reader = request.bufferedReader();

        try {

            return mObjectMapper.readValue(reader, clazz);

        } catch (JsonParseException e) {

            IOException ioException = new IOException("Parsing JSON failed");
            ioException.initCause(e);
            throw ioException;

        } finally {
            try {
                reader.close();
            } catch (IOException ignored) {
                // Ignored
            }
        }
    }

    /**
     * Perform GET request.
     * 
     * @param url the url
     * @return the http request
     */
    protected HttpRequest get(final String url) {
        return HttpRequest
                .get(BASE_URL + url)
                .header("X-Api-Key", Config.ApiKeys.EIGHT_TRACKS);
    }

    /**
     * Verify request response code is a 200 OK and throw an exception when it
     * is not
     * 
     * @param request
     * @return request
     * @throws IOException
     */
    protected HttpRequest ok(HttpRequest request) throws IOException {
        if (!request.ok())
            throw new IOException("Unexpected response code of "
                    + request.code());
        return request;
    }
}
