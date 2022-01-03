import React from "react";
import { Link } from "react-router-dom";
import { Constants } from "../../constants/Constants";
function LandingPage() {
  return (
    <div>
      <h1>Welcome to a Janky Bank!</h1>
      <br />
      <Link to={"/" + Constants.NEW_ACCOUNT}>Create New Account</Link> <hr />
      <Link to={"/" + Constants.LOG_IN}>Log in</Link>
    </div>
  );
}

export default LandingPage;
