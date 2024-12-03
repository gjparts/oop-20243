using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace OOP20243
{
    public partial class Principal : Form
    {
        public Principal()
        {
            InitializeComponent();
        }

        private void pruebaConexion_Click(object sender, EventArgs e)
        {
            //prueba de conexion
            try
            {
                //crear objeto de conexion a la base de datos
                SqlConnection con = new SqlConnection(Properties.Resources.cadenaConexion);
                //ejecutar una prueba de conexion al servidor: abrir conexion
                con.Open();
                //si llego aqui es porque la prueba exitosa
                MessageBox.Show("Conexion exitosa");
                //cerrar la conexion a la base de datos
                con.Close();
            }catch(Exception ex)
            {
                MessageBox.Show(ex.Message); //mostrar mensaje en caso de error
            }
        }
    }
}
