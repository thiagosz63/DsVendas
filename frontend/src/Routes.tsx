import { BrowserRouter, Routes as Switch, Route } from "react-router-dom";
import Footer from "./components/Footer";
import NavBar from "./components/NavBar";
import Dashboard from "./pages/Dashboard";
import Home from "./pages/Home";

export default function Routes() {
    return (
        <BrowserRouter>
            <NavBar />
            <Switch>
                <Route path="/" element={<Home />} />
                <Route path="/dashboard" element={<Dashboard />} />
            </Switch>
            <Footer />
        </BrowserRouter>

    )
}