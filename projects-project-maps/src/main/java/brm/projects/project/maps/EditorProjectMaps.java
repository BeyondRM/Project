package brm.projects.project.maps;
import brm.projects.project.maps.map.EditorProjectMap;
import java.util.List;


/**
 * The Editor's Project Maps. This class manages the various maps related to a particular project instance. It is not a
 * singleton class because in the event that BeyondRM allows opening multiple projects (at some point in the future), a
 * logical instance of this class should be opened per project.
 * @author Gregory <gregory.cheyney@gmail.com>
 */
public class EditorProjectMaps {
  protected List<EditorProjectMap> map;

  public EditorProjectMaps() {
  }
}
