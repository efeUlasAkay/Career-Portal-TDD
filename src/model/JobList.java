/**
 * 
 */
package model;

import java.util.List;

/**
 * JobList
 *
 * @author djcedrics
 * @date May 15, 2018
 */
public class JobList {
	
	// Properties
	public List<Job> jobsPosted;
	
	/** JobList Constructor
	 * @param jobsPosted
	 */
	public JobList(List<Job> jobsPosted) {
		this.jobsPosted = jobsPosted;
	}

	public List<Job> getJobsPosted() {
		return jobsPosted;
	}

	public void setJobsPosted(List<Job> jobsPosted) {
		this.jobsPosted = jobsPosted;
	}
	
	

}
