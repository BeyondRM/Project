package brm.projects;


/**
 * BeyondRM Projects manager.
 * @author Gregory <gregory.cheyney@gmail.com>
 * @see #instance instance
 * @see #Projects() Projects()
 */
public class Projects {
  /**
   * The default instance.
   * @see Projects
   */
  public static final Projects instance;

  static {
    instance = new Projects();
  }

  /**
   * A private constructor. Goes nowhere, does nothing.
   * @see Projects
   */
  private Projects() {
  }
}
