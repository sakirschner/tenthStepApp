import React from 'react';
import { Router, Route, Switch } from 'react-router-dom';
import NavBar from './components/shared/NavBar';
import Home from './components/Home';
import Entry from './components/Entry';
import history from './history';

const App = () => {
  return (
    <div>
        <Router history={history}>
          <div>
            <NavBar />
            <Switch>
                <Route path="/" exact component={Home} />
                <Route path="/Create" exact component={Entry} />
            </Switch>
          </div>
        </Router>      
    </div>
  );
};

export default App;
