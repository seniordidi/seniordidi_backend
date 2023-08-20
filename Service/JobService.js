const Job = require('../Models/Job');
const { options } = require('../Routes/JobRoutes');

const createJob = async (jobData) => {
  try {
    const job = await Job.create(jobData);
    return job; // No need to wrap in { job }
  } catch (err) {
    throw new Error(err.message); // Throwing an error for better error handling
  }
};

const getAllJob = async (pageNumber,limit) => {

  try {
    
    let options={
        page: pageNumber,
        limit: limit,
        sort: { createdAt: -1 },
    }
    const jobs = await Job.paginate({},options);
    return jobs; // No need to wrap in { job }
  } catch (err) {
    throw new Error(err.message); // Throwing an error for better error handling
  }
};
const getJobByTitle = async (searchQuery) => {
    try {
        console.log(searchQuery,"dsfsg")

      // Using MongoDB's $regex operator for case-insensitive text search
      const jobPosts = await Job.find({
        $or: [
          { title: { $regex: new RegExp(searchQuery, 'i') } },
          { description: { $regex: new RegExp(searchQuery, 'i') } },
          // Add more fields here for additional search criteria (e.g., employerName, location, etc.)
        ],
      });
      return jobPosts;
    } catch (error) {
      throw new Error(error.message);
    }
  };
  
  
const getJobById = async (jobId) => {
  try {
    const job = await Job.findById(jobId);
    return job; // No need to wrap in { job }
  } catch (err) {
    throw new Error(err.message); // Throwing an error for better error handling
  }
};

const updateJobById = async (jobId, updatedData) => {
  try {
    const updatedJob = await Job.findByIdAndUpdate(jobId, updatedData, { new: true });
    return updatedJob; // No need to wrap in { updatedJob }
  } catch (error) {
    throw new Error(error.message); // Throwing an error for better error handling
  }
};

const deleteJobById = async (jobId) => {
  try {
    const deletedJob = await Job.findByIdAndDelete(jobId);
    return deletedJob; // No need to wrap in { deletedJob }
  } catch (error) {
    throw new Error(error.message); // Throwing an error for better error handling
  }
};

module.exports = {
  createJob,
  getAllJob,
  getJobById,
  updateJobById,
  deleteJobById,
  getJobByTitle
};
