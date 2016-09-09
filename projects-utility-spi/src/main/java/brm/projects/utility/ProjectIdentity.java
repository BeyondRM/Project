package brm.projects.utility;


/**
 * The project identity.
 * @author Gregory <gregory.cheyney@gmail.com>
 */
public interface ProjectIdentity {
  default public String getProjectName() {
    return null;
  }

  default public void setProjectName(String s) {
  }
}
