import { getAllUsers } from "./component/UserService";
import "./App.css";
import { useEffect, useState } from "react";
import axios from "axios";
import { FormTable } from "./component/FormTable";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import { CreateAccountPage } from "./component/pages/CreateAccount";
import { Constants } from "./constants/Constants";
// import { NewAccount } from "./component/NewAccount";
import { DisplayTable } from "./component/DisplayTable";
import LandingPage from "./component/pages/LandingPage";

function App() {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios.all([getAllUsers()]).then(
      axios.spread(function (res) {
        if (res.status === 200) {
          setData(res.data);
        }
      })
    );
  }, []);

  return (
    <>
      <Router>
        <Switch>
          <Route path={"/"}>
            <LandingPage />
          </Route>

          <Route path={"/" + Constants.NEW_ACCOUNT}>
            <CreateAccountPage />
          </Route>
          <Route path={"/" + Constants.DISPLAY_ALL_USER}>
            <DisplayTable data={data} />
          </Route>
          <Route path={"/" + Constants.ADD_NEW_USER}>
            <FormTable />
          </Route>
        </Switch>
      </Router>
    </>
  );
}

export default App;
