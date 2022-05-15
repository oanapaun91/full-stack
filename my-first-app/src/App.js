import logo from './devmindLogo.png';
import './App.css';
import Counter from "./components/counter/Counter";
import EmployeeOverview from "./components/EmployeeOverview.jsx";
import WelcomeMessage from "./components/WelcomeMessage";
import StopWatch from "./components/StopWatch";

function App() {
  return (

    <div className="App">
        <WelcomeMessage></WelcomeMessage>
        <Counter/>
        <EmployeeOverview/>
        <StopWatch/>
    </div>
  );
}

export default App;
