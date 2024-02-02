package proxy_pattern.third_party_youtube_lib;

import java.util.List;

/*
     The concrete implementation of a service connector. Methods
     of this class can request information from YouTube. The speed
     of the request depends on a user's internet connection as
     well as YouTube's. The application will slow down if a lot of
     requests are fired at the same time, even if they all request
     the same information.
 */
public class ThirdPartyYoutubeImpl implements IThirdPartyYoutubeLib{

    @Override
    public List<Video> listVideos() {
        return null;
    }

    @Override
    public Video getVideo(String title) {
        return null;
    }

    @Override
    public Video downloadVideo(String title) {
        return null;
    }
}
