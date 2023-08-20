const mongoose = require('mongoose');
const { Schema } = mongoose;

const candidateSchema = new Schema({
  collegeName: {
    type: String,
    required: true,
  },
  degree: {
    type: String,
    required: true,
  },
  yearOfPassing: {
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
  // Relationship with User
  user: {
    type: Schema.Types.ObjectId,
    ref: 'User',
    required: true,
  },
});

const Candidate = mongoose.model('Candidate', candidateSchema);

module.exports = Candidate;
