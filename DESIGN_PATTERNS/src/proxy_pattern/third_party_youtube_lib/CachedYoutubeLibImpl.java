package proxy_pattern.third_party_youtube_lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
     To save some bandwidth, we can cache request results and keep
     them for some time. But it may be impossible to put such code
     directly into the service class. For example, it could have
     been provided as part of a third party library and/or defined
     as `final`. That's why we put the caching code into a new
     proxy class which implements the same interface as the
     service class. It delegates to the service object only when
     the real requests have to be sent.
 */
public class CachedYoutubeLibImpl implements IThirdPartyYoutubeLib {

    private boolean needReset;

    private List<Video> videoes = new ArrayList<>();

    private Video video;
    private IThirdPartyYoutubeLib thirdPartyYoutubeLib;


    public CachedYoutubeLibImpl() {
        this.thirdPartyYoutubeLib = new ThirdPartyYoutubeImpl();
    }

    @Override
    public List<Video> listVideos() {

        if (videoes.isEmpty() || needReset)
            videoes = thirdPartyYoutubeLib.listVideos();
        return videoes;
    }

    @Override
    public Video getVideo(String title) {

        if (video == null)
            video = thirdPartyYoutubeLib.getVideo(title);

        return video;
    }

    @Override
    public Video downloadVideo(String title) {
        return getVideo(title);
    }
}
