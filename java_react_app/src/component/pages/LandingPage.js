import React from "react";
import { Link } from "react-router-dom";
import { Constants } from "../../constants/Constants";
function LandingPage() {
  return (
    <div>
      <Link to="/new-acc">Create New Account</Link>
      <Link to={"/" + Constants.LOG_IN}>Log in</Link>
    </div>
  );
}

export default LandingPage;
