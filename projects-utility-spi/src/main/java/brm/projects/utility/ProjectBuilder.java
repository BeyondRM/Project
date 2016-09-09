package brm.projects.utility;


/**
 * The project builder interface. This interface defines the methods which are used in cleaning and building the engine
 * data, for use in either test-play or for release in a finished game.
 * <h1>Clean, Build, Test, Release.</h1>
 * While we are not forcing the users of the BeyondRM to become regular software developers, it may help to acknowledge
 * the general steps taken in developing software systems. It is usually an iterative collection of steps that are used
 * to go from a preliminary project of bare-bones source code, to a fully-developed and compiled application or library
 * of modules. This often devolves into the following meta-steps:
 * <ul>
 * <li/>Adding classes (scripts), fields (variables), methods (functions), and other lines of code to the source files.
 * <li/>Trying to "build" or "compile" the source code to see if the compiler process chokes on any bit of source code.
 * <li/>Trying to test-run the compiled result, to see if the program runs or if any "bugs" can be found.
 * <li/>Trying to "clean and build" for a release-candidate object.
 * </ul>
 * Of course, in the above, a "compile" in many computer languages means converting to intermediate binary or byte-code
 * objects; and a "build" is assembling all the compiled objects into the finalized executable form. Also, the cleaning
 * in the last bullet-point is meant to wipe away any files left over from previous compiling and building steps; it is
 * a pseudo-guarantee that the developer is not working with previous binary data and executables. Some developers like
 * their development-environment to keep precompiled "working copy" objects cached with their projects at any one time;
 * it may shorten or simplify some compilation and building times, but otherwise is unnecessary.
 * <p>
 * In Enterbrain's RPG Maker products, the goal is to keep the database working-copy data as binary objects, not openly
 * editable text files such as Ruby scripts and assorted Database files as XML or other interpretable markup data. This
 * is in some part due to their "protecting" their assets from being openly modified outside of their editor interfaces
 * &mdash; even though a role-playing game maker would benefit from a more open-source approach. The benefit is that it
 * is merely a matter of converting from the editor's binary format to the engine's binary format, in releasing a game.
 * <p>
 * But in contrast, BeyondRM is taking a rather unique approach in trying to maintain as much openness as is necessary,
 * for multiple reasons. Text-based files are notably easier to index and merge into a version-control repository site,
 * also making team-based game creation quite a bit more easy. Additionally, should something "go wrong" with an editor
 * or with a specified file, it being a text-based file means it's more likely to be fixed just by opening a plain-text
 * editor, looking for an error, then correcting and saving the file again. And these are just the beginning of reasons
 * to use plain text and open formats....
 * <h1>When Is A Project Complete?</h1>
 * Interesting question; but it's one that "depends" &hellip; okay, a bit of programming humor, there&hellip;.
 * <p>
 * In all truth, it's not realistic to expect <i>absolute</i> perfection from a game, because we are all imperfect, and
 * bound to make occasional mistakes. But calling a project "done" without doing more than a cursory test or two may be
 * a bit premature; some players may be <b>really</b> turned off by random crashes, grammatical errors, punctuation and
 * spacing errors, statistical imbalances in characters or monster encounters, et cetera. Beyond that, a game-maker may
 * want to know <i>approximately</i> how many hours of game-play a person can expect to be entertained in a single play
 * of the game; having a general "rough estimate" for a minimum and maximum time length may help the target audience to
 * decide whether they want to take a chance on the game or not.
 * <p>
 * @author Gregory <gregory.cheyney@gmail.com>
 */
public interface ProjectBuilder {
  /**
   * Whether a project data can build. It can build when each data object is considered "valid" and ready to be written
   * as binary data in a building process.
   * @return A {@link Boolean} condition.
   * @see ProjectBuilder
   */
  public boolean canProjectBuild();

  /**
   * Whether a project data can clean. It can clean when target data exists within the project's build path which could
   * be deleted.
   * @return A {@link Boolean} condition.
   * @see ProjectBuilder
   */
  public boolean canProjectClean();

  /**
   * Whether a project can be played as a game. The playing mode assumes nothing more needs to be done; the game engine
   * and assorted data should be considered complete.
   * <p>
   * It is like {@code canProjectPlayTest()}, but without additional diagnostic or post-test information synchronized.
   * @return A {@link Boolean} condition.
   * @see ProjectBuilder
   * @see #canProjectPlayTest() canProjectPlayTest()
   */
  public boolean canProjectPlayGame();

  /**
   * Whether a project can be played as a test. The testing mode may enable certain "test mode" features, as diagnostic
   * components within the game play itself.
   * <p>
   * It is like {@code canProjectPlayTest()}, but under certain circumstances, some test-play resulting data <i>may</i>
   * be importable back into an editor project, allowing for <i>partial</i> two-way data creation.
   * @return A {@link Boolean} condition.
   * @see ProjectBuilder
   */
  public boolean canProjectPlayTest();

  /**
   * Whether a project data is built. A project's data is built only when all build-output is ready to be paired to the
   * engine and released as a finished, functional game, by normal means.
   * <p>
   * In some conditions, we could use the word "finished" rather loosely, where a game-creator might "release" tests of
   * their game data and modules for others to try, while it is still not complete. Usually, this is for the purpose of
   * allowing a few players to act as "beta-testers" in order to find game-breaking bugs or statistical imbalances with
   * the game data.
   * @return A {@link Boolean} condition.
   * @see ProjectBuilder
   */
  public boolean isProjectBuilt();

  /**
   * Whether a project data is clean.
   * @return A {@link Boolean} condition.
   * @see ProjectBuilder
   */
  public boolean isProjectClean();

  /**
   * Perform a begin build step.
   * @see ProjectBuilder
   */
  public void onProjectBuildBefore();

  /**
   * Perform a final build step. The build processes move into the final iteration, where initial and intermediate data
   * will be written to its final phase, and prepared for inclusion with the engine.
   * @see ProjectBuilder
   */
  public void onProjectBuildFinish();

  /**
   * Perform a project cleaning. Testing data and previously-compiled data will be erased. This generally has little to
   * no effect on later build processes, except that previously-built data no longer exists.
   * @see ProjectBuilder
   */
  public void onProjectClean();

  /**
   * @see ProjectBuilder
   */
  public void onProjectPlayGame();

  /**
   * @see ProjectBuilder
   */
  public void onProjectPlayTest();
}
