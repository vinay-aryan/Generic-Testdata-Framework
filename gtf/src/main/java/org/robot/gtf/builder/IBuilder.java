package org.robot.gtf.builder;

import java.io.IOException;

import org.robot.gtf.configuration.BuilderConfiguration;
import org.robot.gtf.configuration.Metadata;

/**
 * Interface for the Builder classes. 
 * @author thomas.jaspers
 */
public interface IBuilder {

	/**
	 * Main method to start building a concrete testsuite file.
	 * @param builderConfiguration Configuration of the Builder
	 * @param metadata The metadata
	 * @return Complete String that represents a "builded" testsuite
	 * @throws IOException 
	 */
	public String build(BuilderConfiguration builderConfiguration, Metadata metadata) throws BuilderException;
}
