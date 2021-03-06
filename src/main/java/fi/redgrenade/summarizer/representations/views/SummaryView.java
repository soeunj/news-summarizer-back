package fi.redgrenade.summarizer.representations.views;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by aleksandr on 26.11.2017.
 */
public class SummaryView {
    @JsonProperty
    private String   summary;

    @JsonProperty
    private String emotions;

    @JsonProperty
    private String tags;

    public SummaryView () {}

    public SummaryView (
            String summary,
            String emotions,
            String tags
    ) {
        this.summary = summary.length() < 3 ? summary : summary.substring(1, summary.length() - 1);
        this.emotions = emotions;
        this.tags = tags;
    }
}
