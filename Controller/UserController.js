const userService = require('../Service/UserServices');

// Controller function to handle the user creation route
const createUser = async (req, res) => {
  try {

    const { role } = req.body;

    if (!['candidate', 'mentor'].includes(role)) {
      return res.status(400).json({ error: 'Invalid role.' });
    }
  // console.log(role,"role")
    // Check if the username is already taken
    const existingUsername = await userService.findUserByUsername(req.body.username);
    if (existingUsername) {

      return res.status(400).json({ error: 'Username is already taken.' });
    }
    // console.log(existingUsername,"existingUsername");

    // Check if the email is already registered
    const existingEmail = await userService.findUserByEmail(req.body.email);
    if (existingEmail) {
      // console.log(existingEmail,"existingEmail");  
      return res.status(400).json({ error: 'Email is already registered.' });
    }

     // Check if the email is valid
     if (!userService.isValidEmail(req.body.email)) {
        // console.log(req.body.email,"req.body.email");
        return res.status(400).json({ error: 'Invalid email address.' });
    }


    // Check if the mobile number is valid (for demonstration, assuming a 10-digit number)
    if (req.body.mobile && !/^\d{10}$/.test(req.body.mobile)) {
      // console.log(req.body.mobile,"req.body.mobile");  
      return res.status(400).json({ error: 'Invalid mobile number.' });
    }

   
    // Check if the password is valid (for demonstration, assuming a minimum of 8 characters and at least one letter and one number)
    if (req.body.password &&  !/^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/.test(req.body.password)) {
        return res.status(400).json({ error: 'Invalid password.' });
    }

    function generateUsername() {
        return req.body.username = req.body.email.split('@')[0]+Math.floor(Math.random() * 1000);
    }


    let roleData;
    let userData = {
      username: generateUsername(),
      email: req.body.email,
      name: req.body.name,
      password: req.body.password,
      mobile: req.body.mobile ? req.body.mobile:null,
      role: req.body.role,
    };
    // console.log(userData,"userData")

    if (role === 'candidate') {
      roleData = {
        collegeName: req.body.collegeName,
        degree: req.body.degree,
        yearOfPassing: req.body.yearOfPassing,
        skills: req.body.skills,
      };
    } else if (role === 'mentor') {
      roleData = {
        companyName: req.body.companyName,
        designation: req.body.designation,
        experience: req.body.experience,
        skills: req.body.skills,
        salaryExpectationPerHour: req.body.salaryExpectationPerHour,
      };
    }
    // console.log(userData, roleData)
    const savedData = await userService.createUserWithRoleData(userData, roleData);
    res.json(savedData);
  } catch (error) {
    res.status(500).json({ error });
  }
};

module.exports = {
  createUser,
};
