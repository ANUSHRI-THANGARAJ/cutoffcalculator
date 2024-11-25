<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Application Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f9f9f9;
        }
        .form-container {
            background: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        .form-container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }
        .form-container label {
            font-weight: bold;
            display: block;
            margin-top: 10px;
            color: #555;
        }
        .form-container input,
        .form-container select,
        .form-container button {
            width: 100%;
            margin-top: 5px;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ddd;
            font-size: 14px;
        }
        .form-container button {
            background-color: #007BFF;
            color: white;
            border: none;
            cursor: pointer;
            margin-top: 15px;
        }
        .form-container button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Job Application Form</h2>
        <form id="application-form">
            <label for="name">Name:</label>
            <input type="text" id="name" placeholder="Enter your name" required>

            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" required>

            <label for="phoneNumber">Phone Number:</label>
            <input type="tel" id="phoneNumber" placeholder="Enter your phone number" required>

            <label for="gender">Gender:</label>
            <select id="gender" required>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>

            <label for="interest">Area of Interest:</label>
            <input type="text" id="interest" placeholder="Enter your area of interest" required>

            <label for="position">Position:</label>
            <input type="text" id="position" placeholder="Enter the position you are applying for" required>

            <label for="resume">Resume Link:</label>
            <input type="url" id="resume" placeholder="Paste your resume link here" required>

            <button type="submit">Submit</button>
        </form>
    </div>

    <script>
        document.getElementById('application-form').addEventListener('submit', async function (event) {
            event.preventDefault(); // Prevent default form submission

            const applicantData = {
                name: document.getElementById('name').value,
                dateOfBirth: document.getElementById('dob').value,
                phoneNumber: document.getElementById('phoneNumber').value,
                gender: document.getElementById('gender').value,
                areaOfInterest: document.getElementById('interest').value,
                position: document.getElementById('position').value,
                resumeLink: document.getElementById('resume').value
            };

            try {
                const response = await fetch('http://localhost:8080/api/applicants/apply', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(applicantData)
                });

                if (response.ok) {
                    // Redirect to success page
                    window.location.href = '/success.html';
                } else {
                    alert('Failed to submit the application. Please try again.');
                }
            } catch (error) {
                console.error('Error:', error);
                alert('Failed to submit the application. Please try again.');
            }
        });
    </script>
</body>
</html>