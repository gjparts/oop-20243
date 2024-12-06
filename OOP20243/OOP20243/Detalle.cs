using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace OOP20243
{
    public partial class Detalle : Form
    {
        public Detalle()
        {
            InitializeComponent();
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            //cerrar el formulario actual destruydendolo
            this.Dispose();
        }

        private void btnAceptar_Click(object sender, EventArgs e)
        {
            //validaciones
            try
            {
                if( Codigo.Text.Trim().Length == 0)
                {
                    MessageBox.Show("Codigo no puede ir en blanco");
                    return; //no continua
                }
                if (Nombre.Text.Trim().Length == 0)
                {
                    MessageBox.Show("Nombre es obligatorio");
                    return; //no continua
                }
                if( Double.Parse(Costo.Text) < 0)
                {
                    MessageBox.Show("Costo no puede ser un numero negativo");
                    return; //no continua
                }
                if( Double.Parse(PrecioVenta.Text) <= 0)
                {
                    MessageBox.Show("Precio de Venta no puede ser <= 0");
                    return; //no continua
                }
                if ( Existencias.Text.Trim().Length == 0 )
                {
                    MessageBox.Show("Existencias no pueden ir en blanco");
                    return; //no continua
                }
                //si llego hasta aqui, todo salio bien. Solo cerramos el formulario sin destruirlo
                this.Close();
            }
            catch(Exception ex)
            {
                MessageBox.Show("Revise que los datos digitados son correctos.");
            }
        }
    }
}
