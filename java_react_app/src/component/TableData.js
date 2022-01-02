import { Component } from "react";

class Table extends Component {
  constructor(props) {
    super(props);
    this.state = {
      data: props.data,
    };
  }
  displayTable() {
    return this.state.data.map((user, idx) => {
      const { id, username, email, password } = user;
      return (
        <tr key={id}>
          <td>{id}</td>
          <td>{username}</td>
          <td>{email}</td>
          <td>{password}</td>
        </tr>
      );
    });
  }
  render() {
    return (
      <div>
        <h3>Data table</h3>
        <table id="data">
          <thead>
            <tr>
              <th>id</th>
              <th>username</th>
              <th>email</th>
              <th>password</th>
            </tr>
          </thead>
          <tbody>{this.displayTable()}</tbody>
        </table>
      </div>
    );
  }
}

export default Table;
