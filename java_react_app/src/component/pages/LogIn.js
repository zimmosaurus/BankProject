import React, { Component } from "react";

export default class LogIn extends Component {
  render() {
    const credentials = Object.freeze({
      userName: "",
      password: "",
    });
    return (
      <div>
        <h3>Log in!</h3>
        <form>
          <input type="text" placeholder="username" />
          Username
          <input type="password" placeholder="password" />
          Password
          <button type="submit">Log in</button>
        </form>
      </div>
    );
  }
}
