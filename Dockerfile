# Use an official Node.js runtime as the base image
FROM node:14

# Set the working directory in the container
WORKDIR /

# Copy package.json and package-lock.json to the container
COPY package*.json ./

# Install application dependencies
RUN npm install

# Copy the rest of the application code to the container
COPY . .

# Expose the port your application uses
EXPOSE 4000

ENV MONGO_URI="mongodb+srv://nkshrivas01:Java098@cluster0.ijq2nlq.mongodb.net/?retryWrites=true&w=majority"
ENV DBNAME="seniordidi"
ENV PORT="3275"

# Command to start your application
CMD ["node", "server.js"]
