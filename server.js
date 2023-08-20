const express = require('express');
const cors = require('cors');
const app = express();
require('dotenv').config();
const jobRoutes = require('./Routes/JobRoutes');
const userRoutes = require('./Routes/userRoutes');

// Connect to MongoDB
const connectDB = require('./config/db');

connectDB();

// Allowing CORS 
app.use(cors({
    origin: '*'
}));

// Import routes

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// Cors
app.use(cors());




app.use('/api/v1/', jobRoutes);
app.use('/api/v1/user', userRoutes);




 app.listen( process.env.PORT, () => {
    console.log(`Server is running on port ${process.env.PORT}`);
}).on('error', (err) => {
    console.log('Server error:', err.message);
}
);
