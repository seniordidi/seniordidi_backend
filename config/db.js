const mongoose = require('mongoose');

const connectDB = async () => {
    try {
        await mongoose.connect(process.env.MONGO_URI, {
            useUnifiedTopology: true,
            useNewUrlParser: true,
            dbName: process.env.DBNAME // Specify the desired database name here
        });
        console.log('MongoDB connection SUCCESS');
    } catch (error) {
        console.log('MongoDB connection FAIL',error,process.env.MONGO_URI);
        process.exit(1);
    }
}

module.exports = connectDB;
