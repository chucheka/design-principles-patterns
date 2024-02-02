package proxy_pattern.third_party_youtube_lib;

import java.util.List;

public interface IThirdPartyYoutubeLib {

    List<Video> listVideos();

    Video getVideo(String title);

    Video downloadVideo(String title);
}
