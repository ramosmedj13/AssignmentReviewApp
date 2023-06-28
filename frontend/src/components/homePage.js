import React from 'react';
import { Link } from 'react-router-dom';

function homePage() {
  return (
    <div className="container">
      <h1>Welcome to the Assignment Review Application</h1>
      <Link to="/login" className="btn btn-primary">
        LOGIN
      </Link>
    </div>
  );
}

export default homePage;
