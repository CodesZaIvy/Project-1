<!DOCTYPE html>
<html lang="en">
     /*Here comes the CSS code */
    <style>
     body {
  font-family: Arial, sans-serif;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  margin: 0;
  overflow: hidden; /* Hides the overflow of the animated background */
}

.container {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-between; /* To spread the boxes */
  height: 80vh;
  width: 80%; 
  text-align: left;
  position: relative;
  z-index: 1;
  margin: 0 auto;
}

.logo {
  width: 25%; /* Set the image size to a quarter of the container width */
  margin-bottom: 20px; /* Create space between logo and form */
}


.form {
  background: transparent;
  padding: 80px;
  border-radius: 20px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  display: inline-block;
  position: relative; /* Relative positioning for z-index */
  z-index: 2; /* Ensures the form is on top of the background */
}

.form h2 {
  margin-bottom: 40px;
}

input {
  width: 80%;
  padding: 10px;
  margin: 10px 0;
  border: 1px solid #ccc;
  border-radius: 2px;
}

button {
  width: 70%;
  padding: 10px;
  border: none;
  border-radius: 8px;
  cursor: pointer;
}

.hidden {
  display: none;
}

/* Animated Background */
body:before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1; /* Behind the form */
  background: linear-gradient(45deg, #9ca2c4, #556270, #5a8ece, #556270);
  background-size: 400% 400%;
  -webkit-animation: gradient 15s ease infinite;
  animation: gradient 15s ease infinite;
}

@-webkit-keyframes gradient {
  0% {
    background-position: 0% 50%;
  }
  50% {
    background-position: 100% 50%;
  }
  100% {
    background-position: 0% 50%;
  }
}

@keyframes gradient {
  0% {
    background-position: 0% 50%;
  }
  50% {
    background-position: 100% 50%;
  }
  100% {
    background-position: 0% 50%;
  }
}

 </style>

 /*here comes the HTML code */

 <head>
    <meta charset="UTF-8">
    <title>Authentication</title>
    <link rel="stylesheet" href="styles.css">
  </head>
  <body>
    <div class="container">
      <img src="Images/logo.png" alt="Company Logo" class="logo">
      <div class="form">
        <h1>Flora Art Gallery Login</h1>
        <input type="text" id="loginUsername" placeholder="Username" required>
        <input type="password" id="loginPassword" placeholder="Password" required><label for="rememberMe">
            <input type="checkbox" id="rememberMe"> Remember Me
          </label>
        <button type="submit">Login</button>
      </div>
  
      <form id="signupForm" class="form hidden">
        <h2>Sign Up</h2>
        <input type="text" id="signupUsername" placeholder="Username" required>
        <input type="password" id="signupPassword" placeholder="Password" required>
        <button type="submit">Sign Up</button>
      </form>
    </div>

  //This is the javascript code 

  <script>
    document.getElementById("loginForm").addEventListener("submit", function(event) {
  event.preventDefault();
  const username = document.getElementById("loginUsername").value;
  const password = document.getElementById("loginPassword").value;

  // Validate the username and password (dummy validation for example)
  if (username === "user" && password === "password") {
    alert("Login successful!");
    // Redirect to a new page or perform any other action after successful login
  } else {
    alert("Invalid username or password");
  }
});

document.getElementById("signupForm").addEventListener("submit", function(event) {
  event.preventDefault();
  const newUsername = document.getElementById("signupUsername").value;
  const newPassword = document.getElementById("signupPassword").value;

  // Perform signup action (dummy action for example)
  alert("Signup successful for " + newUsername + "!");
  // You might want to save this information or perform additional actions
});

document.addEventListener("DOMContentLoaded", function() {
  const loginForm = document.getElementById("loginForm");
  const signupForm = document.getElementById("signupForm");

  document.getElementById("signupForm").style.display = "none"; // Hide signup form by default

  document.getElementById("showSignup").addEventListener("click", function() {
    loginForm.classList.add("hidden");
    signupForm.classList.remove("hidden");
  });

  document.getElementById("showLogin").addEventListener("click", function() {
    signupForm.classList.add("hidden");
    loginForm.classList.remove("hidden");
  });
});

  </script>
</body>
</html>
