package brm.projects.versioning.archetypes;
import java.io.File;


/**
 * Version to a cloud repository. This is for an online repository, usually one hosted on a public website (although it
 * could be private instead). The destination site usually requires a login or access permissions of some kind.
 * @author Gregory <gregory.cheyney@gmail.com>
 */
public class VersionRepoCloud implements IArchetypeVersion {

  @Override
  public boolean createLocation(File f) {
    return false;
  }

  @Override
  public boolean isCurrent() {
    return false;
  }

  @Override
  public boolean updatePull() {
    return false;
  }

  @Override
  public boolean updatePush() {
    return false;
  }
}
