package hu.bme.mdsd.ztz.model.derived.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.derived.CurrentTaskMatch;
import hu.bme.mdsd.ztz.model.derived.CurrentTaskMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CurrentTaskMatcher in a type-safe way.
 * 
 * @see CurrentTaskMatcher
 * @see CurrentTaskMatch
 * 
 */
@SuppressWarnings("all")
public final class CurrentTaskQuerySpecification extends BaseGeneratedEMFQuerySpecification<CurrentTaskMatcher> {
  private CurrentTaskQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CurrentTaskQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CurrentTaskMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CurrentTaskMatcher.on(engine);
  }
  
  @Override
  public CurrentTaskMatch newEmptyMatch() {
    return CurrentTaskMatch.newEmptyMatch();
  }
  
  @Override
  public CurrentTaskMatch newMatch(final Object... parameters) {
    return CurrentTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.Action) parameters[0], (hu.bme.mdsd.ztz.model.drone.Task) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CurrentTaskQuerySpecification INSTANCE = make();
    
    public static CurrentTaskQuerySpecification make() {
      return new CurrentTaskQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CurrentTaskQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.derived.currentTask";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("action","task");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("action", "hu.bme.mdsd.ztz.model.behaviour.Action"),new PParameter("task", "hu.bme.mdsd.ztz.model.drone.Task"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_action = body.getOrCreateVariableByName("action");
      		PVariable var_task = body.getOrCreateVariableByName("task");
      		new TypeConstraint(body, new FlatTuple(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "Action")));
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_action, "action"),
      		   new ExportedParameter(body, var_task, "task")
      		));
      		// 	Action.currentTaskExecution.task(action, task)
      		new TypeConstraint(body, new FlatTuple(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "Action")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_action, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "Action", "currentTaskExecution")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskExecution", "task")));
      		new Equality(body, var__virtual_1_, var_task);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("QueryBasedFeature");
      		addAnnotation(annotation);
      	}
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
