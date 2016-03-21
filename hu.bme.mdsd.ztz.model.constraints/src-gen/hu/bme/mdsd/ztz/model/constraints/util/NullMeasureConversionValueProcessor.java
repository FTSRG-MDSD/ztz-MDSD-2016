package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.constraints.NullMeasureConversionValueMatch;
import hu.bme.mdsd.ztz.model.drone.MeasureConversion;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.nullMeasureConversionValue pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NullMeasureConversionValueProcessor implements IMatchProcessor<NullMeasureConversionValueMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pConversion the value of pattern parameter conversion in the currently processed match
   * 
   */
  public abstract void process(final MeasureConversion pConversion);
  
  @Override
  public void process(final NullMeasureConversionValueMatch match) {
    process(match.getConversion());
  }
}
