import { getAllUsers } from "./component/UserService";
import "./App.css";
import { useEffect, useState } from "react";
import axios from "axios";
import { FormTable } from "./component/FormTable";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import CreateAccountPage from "./component/pages/CreateAccount";
import { Constants } from "./constants/Constants";
import { DisplayTable } from "./component/DisplayTable";
import LandingPage from "./component/pages/LandingPage";
import LogIn from "./component/pages/LogIn";

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
        <Routes>
          <Route path={"/"} element={<LandingPage />} />
          <Route
            path={"/" + Constants.NEW_ACCOUNT}
            element={<CreateAccountPage />}
          />
          <Route
            path={"/" + Constants.DISPLAY_ALL_USER}
            element={<DisplayTable />}
          />
          <Route path={"/" + Constants.ADD_NEW_USER} element={<FormTable />} />
          <Route path={"/" + Constants.LOG_IN} element={<LogIn />} />
        </Routes>
      </Router>
    </>
  );
}

export default App;
