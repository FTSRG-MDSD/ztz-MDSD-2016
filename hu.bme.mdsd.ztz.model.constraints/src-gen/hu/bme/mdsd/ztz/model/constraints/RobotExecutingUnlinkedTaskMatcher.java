package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.RobotExecutingUnlinkedTaskMatch;
import hu.bme.mdsd.ztz.model.constraints.util.RobotExecutingUnlinkedTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Task;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.robotExecutingUnlinkedTask pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RobotExecutingUnlinkedTaskMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint (
 * 	key = {"robot", "task"},
 * 	severity = "error",
 * 	message = "$robot$ is executing unlinked task: $task$!",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID"
 * )
 * pattern robotExecutingUnlinkedTask(robot: DynamicRobot, task: Task) {
 * 	DynamicRobot.executedTasks(robot, taskExecution);
 * 	TaskExecution.task(taskExecution, task);
 * 	neg find robotHasTask(robot, task);
 * }
 * </pre></code>
 * 
 * @see RobotExecutingUnlinkedTaskMatch
 * @see RobotExecutingUnlinkedTaskProcessor
 * @see RobotExecutingUnlinkedTaskQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RobotExecutingUnlinkedTaskMatcher extends BaseMatcher<RobotExecutingUnlinkedTaskMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RobotExecutingUnlinkedTaskMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    RobotExecutingUnlinkedTaskMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new RobotExecutingUnlinkedTaskMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ROBOT = 0;
  
  private final static int POSITION_TASK = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(RobotExecutingUnlinkedTaskMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public RobotExecutingUnlinkedTaskMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public RobotExecutingUnlinkedTaskMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return matches represented as a RobotExecutingUnlinkedTaskMatch object.
   * 
   */
  public Collection<RobotExecutingUnlinkedTaskMatch> getAllMatches(final DynamicRobot pRobot, final Task pTask) {
    return rawGetAllMatches(new Object[]{pRobot, pTask});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return a match represented as a RobotExecutingUnlinkedTaskMatch object, or null if no match is found.
   * 
   */
  public RobotExecutingUnlinkedTaskMatch getOneArbitraryMatch(final DynamicRobot pRobot, final Task pTask) {
    return rawGetOneArbitraryMatch(new Object[]{pRobot, pTask});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DynamicRobot pRobot, final Task pTask) {
    return rawHasMatch(new Object[]{pRobot, pTask});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DynamicRobot pRobot, final Task pTask) {
    return rawCountMatches(new Object[]{pRobot, pTask});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DynamicRobot pRobot, final Task pTask, final IMatchProcessor<? super RobotExecutingUnlinkedTaskMatch> processor) {
    rawForEachMatch(new Object[]{pRobot, pTask}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DynamicRobot pRobot, final Task pTask, final IMatchProcessor<? super RobotExecutingUnlinkedTaskMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRobot, pTask}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RobotExecutingUnlinkedTaskMatch newMatch(final DynamicRobot pRobot, final Task pTask) {
    return RobotExecutingUnlinkedTaskMatch.newMatch(pRobot, pTask);
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DynamicRobot> rawAccumulateAllValuesOfrobot(final Object[] parameters) {
    Set<DynamicRobot> results = new HashSet<DynamicRobot>();
    rawAccumulateAllValues(POSITION_ROBOT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfrobot() {
    return rawAccumulateAllValuesOfrobot(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfrobot(final RobotExecutingUnlinkedTaskMatch partialMatch) {
    return rawAccumulateAllValuesOfrobot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfrobot(final Task pTask) {
    return rawAccumulateAllValuesOfrobot(new Object[]{
    null, 
    pTask
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Task> rawAccumulateAllValuesOftask(final Object[] parameters) {
    Set<Task> results = new HashSet<Task>();
    rawAccumulateAllValues(POSITION_TASK, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Task> getAllValuesOftask() {
    return rawAccumulateAllValuesOftask(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Task> getAllValuesOftask(final RobotExecutingUnlinkedTaskMatch partialMatch) {
    return rawAccumulateAllValuesOftask(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Task> getAllValuesOftask(final DynamicRobot pRobot) {
    return rawAccumulateAllValuesOftask(new Object[]{
    pRobot, 
    null
    });
  }
  
  @Override
  protected RobotExecutingUnlinkedTaskMatch tupleToMatch(final Tuple t) {
    try {
    	return RobotExecutingUnlinkedTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) t.get(POSITION_ROBOT), (hu.bme.mdsd.ztz.model.drone.Task) t.get(POSITION_TASK));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RobotExecutingUnlinkedTaskMatch arrayToMatch(final Object[] match) {
    try {
    	return RobotExecutingUnlinkedTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.drone.Task) match[POSITION_TASK]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RobotExecutingUnlinkedTaskMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return RobotExecutingUnlinkedTaskMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.drone.Task) match[POSITION_TASK]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<RobotExecutingUnlinkedTaskMatcher> querySpecification() throws IncQueryException {
    return RobotExecutingUnlinkedTaskQuerySpecification.instance();
  }
}
