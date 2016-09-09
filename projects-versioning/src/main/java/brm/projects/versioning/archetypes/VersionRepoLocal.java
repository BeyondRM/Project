package brm.projects.versioning.archetypes;
import java.io.File;


/**
 * Version to a local repository. This is for a repository which is contained on a user's computer disk or its attached
 * file-storage solution; this includes memory devices such as thumb-drives, memory sticks, home network storage drives
 * and other solutions. The tendency is to not require a password on this method, as it is considered "local" to a user
 * location.
 * @author Gregory <gregory.cheyney@gmail.com>
 */
public class VersionRepoLocal implements IArchetypeVersion {

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
