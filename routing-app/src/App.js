import logo from './logo.svg';
import './App.css';
import {Route, Routes} from "react-router-dom";
import * as PropTypes from "prop-types";
import Home from "./Components_tema/Home";
import ReposComponents from "./Components_tema/ReposComponents";
import {NavigationBar} from "./Components_tema/NavigationBar";
import ReposDetails from "./Components_tema/RepositoryDetails";
import {PostsComponents} from "./Components_tema/PostsComponent";



function App() {
  return (
      <div className = "App">
        <NavigationBar/>
          <Routes>
              {/*<Route path = "/home/:userName" element = {<HomeComponent/>}/>*/}
              {/*<Route path = "/about" element = {<AboutComponent message = "Hello"/>}/>*/}
              {/*<Route path = "/contact" element = {<Contact/>}/>*/}
              <Route path = "/home"  element = {<Home/>}/>
              <Route path = "/"  element = {<Home/>}/>
              <Route path = "/repos"  element = {<ReposComponents/>}/>
              <Route path = "/repos/:repositoryId"  element = {<ReposDetails/>}/>
              <Route path = "/posts"  element = {<PostsComponents/>}/>
          </Routes>
      </div>
  );
}

export default App;
