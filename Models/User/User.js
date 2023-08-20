const mongoose = require('mongoose');
const { Schema } = mongoose;

const userSchema = new Schema({
  username: {
    type: String,
    required: true,
    unique: true,
  },
  email: {
    type: String,
    required: true,
    unique: true,
    // Email validation using regular expression
   
  },
  name: {
    type: String,
    required: true,
  },
  password: {
    type: String,
    required: false,
 
  },
  mobile: {
    type: String,
    required: false,
  
  },
  role: {
    type: String,
    enum: ['candidate', 'mentor'],
    required: true,
  },
});


const User = mongoose.model('User', userSchema);

module.exports = User;
