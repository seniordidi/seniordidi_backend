const express = require('express');
const router = express.Router();
const jobDetailsController = require('../Controller/JobController');

// Define routes for job details CRUD operations
router.post('/job', jobDetailsController.createJobPost);
router.get('/job', jobDetailsController.getAllJobPosts);
router.get('/job', jobDetailsController.getJobPostById);
router.get('/job/search', jobDetailsController.getJobPostsByTitle);
router.put('/job', jobDetailsController.updateJobPost);
router.delete('/job', jobDetailsController.deleteJobPost);

module.exports = router;
