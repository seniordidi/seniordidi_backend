const mongoose = require('mongoose');
const mongoosePaginate = require('mongoose-paginate-v2');


const JobSchema = new mongoose.Schema({
  
  title: { type: String, required: true }, // Job title
  salary: { type: String, required: true }, // Salary range
  jobType: { type: String, required: true }, // Job type (e.g., Regular / Permanent)
  shiftSchedule: { type: String, required: true }, // Shift and schedule (e.g., Day shift)
  benefits: [{ type: String }], // Benefits & Perks (e.g., Work from home)
  description: { type: String, required: true }, // Job description

  // Work experience
  experience: { type: String, required: true },

  // Job location
  location: { type: String, required: true },

  // Roles and responsibilities
  rolesAndResponsibilities: [{ type: String }],

  // Desired skills and competencies
  desiredSkills: [{ type: String }],

  // Qualification
  qualification: { type: String, required: true },

  // Additional information
  additionalInformation: { type: String },


} ,{ timestamps: true }
);

JobSchema.plugin(mongoosePaginate);

module.exports = mongoose.model('Job', JobSchema);