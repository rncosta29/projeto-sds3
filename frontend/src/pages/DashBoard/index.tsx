import NavBar from '../../components/NavBar/index';
import BarChart from '../../components/BarChart/index';
import DonutChart from '../../components/DonutChart/index';
import DataTable from '../../components/DataTable/index';
import Footer from '../../components/Footer/index';

function DashBoard() {
    return(
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-principal py-3">Dashboard de vendas</h1>

                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa de sucesso</h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Todas vendas</h5>
                        <DonutChart />
                    </div>
                </div>

                <div className="py-3">
                    <h2 className="text-principal">Todas vendas</h2>    
                </div>

                <DataTable />
            </div>
            <Footer />
        </>
    );
}

export default DashBoard;