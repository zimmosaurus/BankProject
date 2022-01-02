import { useState } from "react";
import Table from "./TableData";

export const DisplayTable = (props) => {
  const [showTable, setShowTable] = useState(false);

  const displayTable = () => {
    setShowTable(true);
  };
  const hideTable = () => {
    setShowTable(false);
  };
  return (
    <>
      <h1>Display Users</h1>
      <button type="button" onClick={displayTable}>
        Show
      </button>
      <button type="button" onClick={hideTable}>
        Hide
      </button>
      {showTable ? <Table data={props.data} /> : <></>}
    </>
  );
};
