const User = require('../Models/User/User');
const Candidate = require('../Models/User/Candidate');
const Mentor = require('../Models/User/Mentor');

// Function to create a new user with candidate or mentor data based on the role
const createUserWithRoleData = async (userData, roleData) => {
  try {
    // Create the user first
    const newUser = new User(userData);
    const savedUser = await newUser.save();

    // If the role is 'candidate', create a candidate entry
    if (savedUser.role === 'candidate') {
      const newCandidate = new Candidate({
        ...roleData,
        user: savedUser._id,
      });
      const savedCandidate = await newCandidate.save();
      return savedCandidate;
    }

    // If the role is 'mentor', create a mentor entry
    if (savedUser.role === 'mentor') {
      const newMentor = new Mentor({
        ...roleData,
        user: savedUser._id,
      });
      const savedMentor = await newMentor.save();
      return savedMentor;
    }

    // Return the saved user data if the role is not 'candidate' or 'mentor'
    return savedUser;
  } catch (error) {
    throw new Error('Error saving data.');
  }
};

const findUserByUsername = async (username) => {
    try {
      const user = await User.findOne({ username });
      return user;
    } catch (error) {
      throw new Error('Error finding user by username.');
    }
  };

  // Function to find a user by email
const findUserByEmail = async (email) => {
    try {
      const user = await User.findOne({ email });
      return user;
    } catch (error) {
      throw new Error('Error finding user by email.');
    }
  };
  
  function isValidEmail(email) {
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
  }
  

module.exports = {
  createUserWithRoleData,
    findUserByUsername,
    findUserByEmail,
    isValidEmail,
};
