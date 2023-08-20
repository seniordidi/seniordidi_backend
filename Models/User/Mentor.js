const mongoose = require('mongoose');
const { Schema } = mongoose;

const mentorSchema = new Schema({
  companyName: {
    type: String,
    required: true,
  },
  designation: {
    type: String,
    required: true,
  },
  experience: {
    type: String,
    required: true,
  },
  skills: {
    type: [String],
    required: true,
    validate: {
      validator: function (v) {
        return v.length <= 10;
      },
      message: 'Skills list cannot have more than 10 items!',
    },
  },
  salaryExpectationPerHour: {
    type: String,
    required: true,
  },
  // Relationship with User
  user: {
    type: Schema.Types.ObjectId,
    ref: 'User',
    required: true,
  },
});

const Mentor = mongoose.model('Mentor', mentorSchema);

module.exports = Mentor;
