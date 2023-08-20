const express = require('express');
const router = express.Router();
const userController = require('../Controller/UserController');

// POST route to create a user, candidate, or mentor
router.post('/createUser', userController.createUser);

module.exports = router;
