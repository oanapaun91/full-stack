import logo from './devmindLogo.png';
import './App.css';
import Counter from "./counter/Counter";

function App() {
  return (
    <div className="App">
        <Counter/>
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Welcome! This is my first React app!
        </p>
        <a
          className="App-link"
          href="https://www.devmind.ro"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>

    </div>
  );
}

export default App;
