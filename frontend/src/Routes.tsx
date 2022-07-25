import { BrowserRouter, Routes as Switch, Route } from "react-router-dom";
import Dashboard from "./pages/Dashboard";
import Home from "./pages/Home";

export default function Routes() {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" element={<Home />} />
                <Route path="/dashboard" element={<Dashboard />} />
            </Switch>
        </BrowserRouter>

    )
}