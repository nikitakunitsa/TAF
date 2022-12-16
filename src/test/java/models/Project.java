package models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
public class Project {
    private String name;
    private String announcement;
    @SerializedName(value = "show_announcement")
    private boolean isShowAnnouncement;
    @SerializedName(value="suite_mode")
    private int TypeOfProject;
    private boolean isCompleted;
}
