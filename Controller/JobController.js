const jobDetailsService = require('../Service/JobService');


// Controller function to create a new job post
const createJobPost = async (req, res) => {
  try {
    const jobData = req.body;
    const newJobPost = await jobDetailsService.createJob(jobData);
    res.status(201).json(newJobPost);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

// Controller function to get all job posts
const getAllJobPosts = async (req, res) => {
 
    const pageNumber = parseInt(req.query.pageNumber) || 1;
    const limit = parseInt(req.query.limit) || 10; //
    // console.log(pageNumber);
    
    try {
    const jobPosts = await jobDetailsService.getAllJob(pageNumber,limit);
    // console.log(jobPosts)
    res.status(200).json(jobPosts);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

//Controller function to get job posts by title
const getJobPostsByTitle = async (req, res) => {
    try {
        const title = req.query.s;
        const jobPosts = await jobDetailsService.getJobByTitle({title});

        res.status(200).json(jobPosts);
    } catch (error) {
        res.status(500).json({ error: error.message });
    }
};

// Controller function to get a job post by ID
const getJobPostById = async (req, res) => {
  try {
    const postId = req.query.id;
    const jobPost = await jobDetailsService.getJobById(postId);
    if (!jobPost) {
      return res.status(404).json({ error: 'Job post not found.' });
    }
    res.status(200).json(jobPost);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

// Controller function to update a job post
const updateJobPost = async (req, res) => {
  try {
    const postId = req.query.id;
    const updatedData = req.body;
    const updatedJobPost = await jobDetailsService.updateJobById(postId, updatedData);
    res.status(200).json(updatedJobPost);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

// Controller function to delete a job post
const deleteJobPost = async (req, res) => {
  try {
    const postId = req.query.id;
    await jobDetailsService.deleteJobById(postId);
    res.status(200).json({ message: 'Job post deleted successfully.' });
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

module.exports = {
  createJobPost,
  getAllJobPosts,
  getJobPostById,
  updateJobPost,
  deleteJobPost,
  getJobPostsByTitle
};
