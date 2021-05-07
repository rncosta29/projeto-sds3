import { BrowserRouter, Route, Switch } from 'react-router-dom';

import Home from 'pages/Home';
import DashBoard from 'pages/DashBoard';

function Routes() {
    return(
        <BrowserRouter>
            <Switch>
                <Route path="/" exact component={Home} />
                <Route path="/dashboard" component={DashBoard} />
            </Switch>
        </BrowserRouter>
    )
}

export default Routes;