
package com.musyqa.android.eighttracks;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.kevinsawicki.http.HttpRequest;
import com.github.kevinsawicki.http.HttpRequest.HttpRequestException;
import com.musyqa.android.Config;

import java.io.IOException;

/**
 * The Class EightTracksHttpClient.
 */
public class EightTracksHttpClient {

    public MixSet getMixSet() {
        HttpRequest httpRequest = HttpRequest.get("http://8tracks.com/mixes.json");
        httpRequest.header("X-Api-Key", Config.ApiKeys.EIGHT_TRACKS);

        if (httpRequest.ok()) {
            ObjectMapper objectMapper = new ObjectMapper();
            MixSet mixSet;
            try {
                mixSet = objectMapper.readValue(httpRequest.bufferedReader(), MixSet.class);
                return mixSet;
            } catch (JsonParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (JsonMappingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (HttpRequestException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        } else {
            return null;
        }
    }
}
