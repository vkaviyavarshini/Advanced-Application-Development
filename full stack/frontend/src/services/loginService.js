import { API_URL } from "../config/config";

const authenticate = async (username, password) => {
  try {
    const response = await fetch(`${API_URL}/auth/authenticate`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*',
      },
      body: JSON.stringify({ username: username, password: password }),
    });
    
    if (response.ok) {
      const token = await response.text();
      localStorage.setItem('token', token);
      return {
        authenticated: true,
        isAdmin: JSON.parse(atob(token.split('.')[1])).role
      };
    } else {
      return {authenticated: false};
    }
  } catch (error) {
    console.log("Error", error);
    return {authenticated: false};
  }
}

const registerNewUser = (body) => {
    fetch(`${API_URL}/auth/new`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(body)
    }).then(res => {
        console.log(res);
    }).catch(err => {
        console.log("Error", err);
    });
}


// const UpdateUserDetails = (userDetails) => {
//   return fetch(`${API_URL}/api/updateUserDetails`, {
//     method: 'POST',  // Use the appropriate HTTP method (POST, PUT, PATCH, etc.)
//     headers: {
//       'Content-Type': 'application/json',
//     },
//     body: JSON.stringify(userDetails),
//   })
//     .then(response => {
//       if (!response.ok) {
//         throw new Error('Failed to update user details');
//       }
//       return response.json();
//     })
//     .then(data => {
//       console.log('User details updated successfully:', data);
//       // Add any additional logic after successful update
//       return data;
//     })
//     .catch(error => {
//       console.error('Error updating user details:', error);
//       throw error;
//     });
// };

// export default UpdateUserDetails;
export {authenticate, registerNewUser}