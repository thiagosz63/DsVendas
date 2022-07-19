import './App.css';
import "bootstrap/dist/css/bootstrap.css"
import "bootstrap/dist/js/bootstrap.js"
import NavBar from './components/NavBar';
import Footer from './components/Footer';
import DataTable from './components/DataTable';

export default function App() {
  return (
    <>
      <NavBar />
      <div className='container'>
        <h1 className='text-primary'>Ola mundo!</h1>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}
