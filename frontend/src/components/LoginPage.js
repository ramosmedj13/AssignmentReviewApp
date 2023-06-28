import React, { useState } from 'react';
import { useHistory } from 'react-router-dom';
import { login } from './api';

function LoginPage() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const history = useHistory();

  const handleLogin = async (e) => {
    e.preventDefault();
    try {
      // API returns a token upon successful authentication
      const response = await login(username, password);

      // Save the token to local storage or session storage for further authentication checks
      const token = response.token;

      // Redirect the user to the Dashboard page
      history.push('/dashboard');
    } catch (error) {
      console.log('Login error:', error);
      // Handle login error
    }
  };

  return (
    <div className="container">
      <h1>Login Page</h1>
      <form onSubmit={handleLogin}>
        <div className="form-group">
          <label htmlFor="username">Username</label>
          <input
            type="text"
            className="form-control"
            id="username"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
          />
        </div>
        <div className="form-group">
          <label htmlFor="password">Password</label>
          <input
            type="password"
            className="form-control"
            id="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>
        <button type="submit" className="btn btn-primary">
          Login
        </button>
      </form>
    </div>
  );
}

export default LoginPage;
