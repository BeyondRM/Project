package brm.projects.versioning.archetypes;
import java.io.File;


/**
 * Version to an archive file. This is for creating and managing archives of assorted file changes, usually within just
 * one file path to keep the archives together with the project.
 * @author Gregory <gregory.cheyney@gmail.com>
 */
public class VersionArchiveFile implements IArchetypeVersion {

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
